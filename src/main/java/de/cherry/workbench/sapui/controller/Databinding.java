package de.cherry.workbench.sapui.controller;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Databinding {

  public static HashMap<String, Set<String>> findInString(File file) throws Exception{
    DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    Document doc = dBuilder.parse(file);

    List<String> allMatches = new ArrayList<>();
    NodeList nodeList = doc.getElementsByTagName("*");
    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        // do something with the current element
        //System.out.println(node.getNodeName());
        NamedNodeMap attributes = node.getAttributes();
        for (int j = 0; j < attributes.getLength(); j++) {
          Node item = attributes.item(j);
          String src = item.getNodeValue();
          Matcher m = Pattern.compile("\\{.*\\}")
              .matcher(src);
          while (m.find()) {
            allMatches.add(m.group());
          }
        }
      }
    }
    HashMap<String, Set<String>> databinding = new HashMap<>();

    for (String match : allMatches) {
      match = match.substring(1, match.length() - 1);
      if (match.indexOf(':') != -1) {

        Matcher m = Pattern.compile("(\\{path[ \\t\\n\\x0B\\f\\r]*:[ \\t\\n\\x0B\\f\\r]*([\\'\\\\\"][^\\'\\\\\"]*[\\'\\\\\"])?\\})")
            .matcher(match);
        while (m.find()) {
          String singlePath = m.group().split("[\\'\\\\\"]")[1];
          createModel(databinding, singlePath);
        }
      } else {
        createModel(databinding, match);
      }
    }
    return databinding;
  }

  private static void createModel(HashMap<String, Set<String>> databinding, String match) {
    String[] split = match.split(">");
    Set<String> params = databinding.get(split[0]);
    if (params == null) {
      params = new HashSet<>();
    }
    params.add(split[1]);
    databinding.put(split[0], params);
  }
}
