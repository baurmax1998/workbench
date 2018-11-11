package de.cherry.workbench.sapui.facade;


import de.cherry.workbench.sapui.SapUiBench;
import de.cherry.workbench.sapui.model.Components;
import de.cherry.workbench.sapui.model.Counter;
import de.cherry.workbench.sapui.model.View;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class SapUiRest {

  //private SapUiBench sapUiBench = SapUiBench.getInstance();

  @GetMapping("/components")
  Components all() {

    return null;
  }

  @GetMapping("/count")
  int count() {
    return Counter.getInstance().count();
  }

}
