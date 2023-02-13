class Bank{  
float rateOfInterest(){return 0;};  
}  
class SBI extends Bank{  
public float rateOfInterest(){return 9.2f;}  
}  
class PNB extends  Bank{  
public float rateOfInterest(){return 8.4f;}  
}  
class HDFC extends  Bank{  
public float rateOfInterest(){return 7.3f;}  
}
class CUB extends Bank{  
public float rateOfInterest(){return 9.7f;}  
}
class banks{  
public static void main(String[] args){  
Bank b= new SBI();  
System.out.println("ROI: "+b.rateOfInterest());  
Bank c= new PNB();  
System.out.println("ROI: "+c.rateOfInterest());  
Bank d= new HDFC();  
System.out.println("ROI: "+d.rateOfInterest());  
Bank e= new CUB();  
System.out.println("ROI: "+e.rateOfInterest());  
}
}  