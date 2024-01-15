package com.example.demo;

abstract class Order{
    int id;
    String desc;
    void display() {
        System.out.print("Id = " + id + "Desc = " + desc);
    }
    void accept(int id,String desc) {
        this.id=id;
        this.desc=desc;
    }
}
class SalesOrder extends Order{
    String vnm;

    void accept2(int id, String desc,String vnm) {
            super.accept(id, desc);
            this.vnm=vnm;
    }
    void display(){
        super.display();
        System.out.println("Vendor Name="+vnm);
    }
}

class PurchaseOrder extends Order{
    String cnm;

    void accept2(int id, String desc, String cnm) {
        super.accept(id, desc);
        this.cnm=cnm;
    }
    void display(){
        super.display();
        System.out.println("Customer Name="+cnm);
    }
}


public class SetBQ1 {
        public static void main (String args[]){
            SalesOrder sobj[]= new SalesOrder[3];
            for(int i=0;i<3;i++)
            {
                sobj[i]=new SalesOrder();
                sobj[i].accept2(1,"PIZZA","LAZIZ");
                sobj[i].display();
            }
            PurchaseOrder pobj[]=new PurchaseOrder[3];
            for(int i=0;i<3;i++)
            {
                pobj[i]=new PurchaseOrder();
                pobj[i].accept2(2,"GS","Munazza");
                pobj[i].display();
            }
        }
}
