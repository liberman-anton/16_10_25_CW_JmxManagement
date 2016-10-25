package tel_ran.networking.management;

import java.util.*;

import tel_ran.networking.management.elements.Router;

public class RoutersMonitoring {
	private Set<Router> routers = new HashSet<>();
	private int interval;
	private boolean monitoring;
	
	public int getInterval() {
		return interval;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	
	public boolean isMonitoring() {
		return monitoring;
	}
	public void setMonitoring(boolean monitoring) {
		this.monitoring = monitoring;
	}
	
	public void activate(){
		while(monitoring){
			for(Router router : routers){
				System.out.println(router);
			}
			try {
				Thread.sleep(interval * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public boolean addRouter(String name, int nInterfaces){
		return routers.add(new Router(name,nInterfaces));
	}
	
	public boolean removeRouter(String name){
		Router router = new Router(name,0);
		return routers.remove(router);
	}

}
