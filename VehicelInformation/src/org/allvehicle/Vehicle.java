  org.allvehicle;
	class Vehicle
	{
	  int model;
	    Vehicle( int m)
	    {
	     model=m;
	    }
	    void VehicleNecessary()
	    {
	        System.out.println("VehicleNecessary: ");
	        System.out.println("Model no: "+model);
	    }
	}
	 
	class Twowheeler extends Vehicle
	{
	    int noofwheel;
	    Twowheeler(int m,int n)
	    {
	        super(m);
	        noofwheel=n;
	    }
	    void getbike()
	    {
	        System.out.println("Two wheeler tvs");
           
	        this.bike;
	        System.out.println("No. of wheel : " +noofwheel);
	    }
	void bicycle()
	    {
	        System.out.println("Two wheeler cycle");
	        super.bicycle();
	        System.out.println("No. of wheel : " +noofwheel);
	    }

	}
	 
	class Threewheeler extends Vehicle
	{
	    int noofwheel;
	    Threewheeler(int m,int n)
	    {
	        super(r,m);
	        noofwheel=n;
	    }
	    void display()
	    {
	        System.out.println("Three wheeler auto");
	        super.display();
	        System.out.println("No. of wheel:" +noofwheel);
	    }
	}
	 
	class Fourwheeler extends Vehicle
	{
	    int noofwheel;
	    Fourwheeler(int m,int n)
	    {
	        super(r,m);
	        noofwheel=n;
	    }
	    void car()
	    {
	        System.out.println("Four wheeler car");
	        super.car();
	        System.out.println("No. of wheel:" +noofwheel);
	    }
	Void bus()
	{
	   System.out.println(“Four wheeler bus”);
	   Super.bus();
	   System.out.println(“No.of.wheel:”, noofwheel);
	}
	     public static void main(String arg[])
	    {
	        Twowheeler t1,t2;
	        Threewheeler th1;
	        Fourwheeler f1,f2,f3;
	        t1.bike();
	        t2.bicycle;
	        th1.auto();
	        f1.car();
	       f2.bus();
	       f3.lorry();
	    }
	}


}
