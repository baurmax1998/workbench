package de.cherry.workbench.sapui.konfiguration;

public class Targets
{
  private SplitscreenTarget splitscreenTarget;

  public SplitscreenTarget getSplitscreenTarget() { return this.splitscreenTarget; }

  public void setSplitscreenTarget(SplitscreenTarget splitscreenTarget) { this.splitscreenTarget = splitscreenTarget; }

  private ProductView productView;

  public ProductView getProductView() { return this.productView; }

  public void setProductView(ProductView productView) { this.productView = productView; }

  private CategoryView categoryView;

  public CategoryView getCategoryView() { return this.categoryView; }

  public void setCategoryView(CategoryView categoryView) { this.categoryView = categoryView; }

  private NotFound notFound;

  public NotFound getNotFound() { return this.notFound; }

  public void setNotFound(NotFound notFound) { this.notFound = notFound; }

  private Welcome welcome;

  public Welcome getWelcome() { return this.welcome; }

  public void setWelcome(Welcome welcome) { this.welcome = welcome; }

  private Home home;

  public Home getHome() { return this.home; }

  public void setHome(Home home) { this.home = home; }

  private HomeSlide homeSlide;

  public HomeSlide getHomeSlide() { return this.homeSlide; }

  public void setHomeSlide(HomeSlide homeSlide) { this.homeSlide = homeSlide; }

  private Cart cart;

  public Cart getCart() { return this.cart; }

  public void setCart(Cart cart) { this.cart = cart; }

  private Checkout checkout;

  public Checkout getCheckout() { return this.checkout; }

  public void setCheckout(Checkout checkout) { this.checkout = checkout; }

  private Ordercompleted ordercompleted;

  public Ordercompleted getOrdercompleted() { return this.ordercompleted; }

  public void setOrdercompleted(Ordercompleted ordercompleted) { this.ordercompleted = ordercompleted; }
}
