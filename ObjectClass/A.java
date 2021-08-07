package ObjectClass;

public class A {
	int i;
	double j;

	public String toString() {
		return Integer.toString(i) + ":" + Double.toString(j);
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof A)) {
			return false;
		}
		A a = (A) obj;
		boolean b = (this.i == a.i && this.j == a.j);
		return b;
	}

	public int hashCode() {
		String s1 = Integer.toString(i);
		String s2 = Double.toString(j);
		int hash = 0;
		hash += s1.hashCode();
		hash += s2.hashCode();
		return hash;

	}

}
