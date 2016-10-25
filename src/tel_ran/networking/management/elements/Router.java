package tel_ran.networking.management.elements;

public class Router {
	private String router;
	private int nInterfaces;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((router == null) ? 0 : router.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Router other = (Router) obj;
		if (router == null) {
			if (other.router != null)
				return false;
		} else if (!router.equals(other.router))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Router [router=" + router + ", nInterfaces=" + nInterfaces + "]";
	}
	public Router(String router, int nInterfaces) {
		super();
		this.router = router;
		this.nInterfaces = nInterfaces;
	}

}
