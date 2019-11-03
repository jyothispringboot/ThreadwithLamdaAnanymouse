package lamda;
//------------------------First Method--------------------------------
/*class Hi implements Runnable
{
	public void run() {
	for(int i=0;i<5;i++) {
	System.out.println("Hi");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
}
class Hello implements Runnable
{
	public void run() {
		for(int i=0;i<5;i++) {			
		System.out.println("Hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
}*/


public class MyThread {
	
	public static void main(String[] args) {
//--------------------------------First Method-------------------------------		
		/*Runnable refHiObj=new Hi();
		Runnable refHelloObj=new Hello();
		Thread t1=new Thread(refHiObj);
		Thread t2=new Thread(refHelloObj);*/
		
//----------------------------Second Method--Here used ananymous class--------
		Runnable refHi=()-> {
					
					for(int i=0;i<5;i++) {
						System.out.println("Hi");	
						try {Thread.sleep(1000);} catch (InterruptedException e) {}
				}	
		};
	 Runnable refHello=()-> {
				for(int i=0;i<5;i++) {
					System.out.println("Hello");
					try {Thread.sleep(1000);} catch (InterruptedException e) {}
				
			}
	
	 };
	Thread t1=new Thread(refHi);
	Thread t2=new Thread(refHello);
		
		
//-----------------------Third Method---Here used Lambda Expressing becuase we are using functional Interface		
/*  Thread t1=new Thread(()-> {
		
		for(int i=0;i<5;i++) {
			System.out.println("Hi");	
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
	}			

});
   Thread t2=new Thread(()-> {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
	}
   });*/
	t1.start();
	//try {Thread.sleep(2000);} catch (InterruptedException e) {}
	t2.start();
	}
}