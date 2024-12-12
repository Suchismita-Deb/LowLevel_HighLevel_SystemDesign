package org.example.Design.SingleResponsibilityPrinciple.ProblematicCode;

public class Invoice {

  private Marker marker; // Invoice has a marker.
  private int quantity;

  public int calculatePrice() {
    return this.quantity * marker.price;
  }

  public void printInvoice(){
    System.out.println("Text.");
  }
}
