package app;

class Mobile extends Product
{
    int storage;
    String os;
    int ram;
    public Mobile() {
        System.out.println("Mobile object constructed");
    }

    void setValues(int Pid,String Pname,long Price,int Storage,String Os,int Ram)
    {
        System.out.println("Setting Values");
        this.setPid(Pid);
        this.pname=Pname;
        this.price=Price;
        this.storage=Storage;
        this.os=Os;
        this.ram=Ram;
    }
    void showDetails(Mobile p)
    {
        System.out.print("\nProduct ID: "+p.getPid()+"\nProduct Name: "+p.pname+"\nPrice: "+p.price+" ");

        System.out.println("\nProduct Storage: "+p.storage+"\nProduct OS: "+p.os+"\nRam: "+p.ram+" ");

    }

    
}