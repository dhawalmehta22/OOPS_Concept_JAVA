package app;

class Product
{
    private int pid;
    public String pname;
    public long price;

    void product()
    {
        System.out.println("Prduct object created");
    }

    void setPid(int Pid)
    {
        this.pid=Pid;
    }
    int getPid()
    {
        return this.pid;
    }
    void setValues(int Pid,String Pname,long Price)
    {
        System.out.println("Setting Values");
        this.pid=Pid;
        this.pname=Pname;
        this.price=Price;
    }
    void showDetails(Product p)
    {
        System.out.println("\nProduct ID: "+p.getPid()+"\nProduct Name: "+p.pname+"\nPrice: "+p.price+" ");

    }
}