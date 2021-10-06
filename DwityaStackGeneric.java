public class DwityaStackGeneric<T> {
	public T[] dwitya;
	public int top = 0;
	
	public DwityaStackGeneric(int n) {
		dwitya = (T[]) new Object[n];
	}
	
	public boolean isEmpty() {
		return top == 0;
		
	public boolean isFull() {
		return top == dwitya.length;
	
	public void push (T value) {
		if ( !isFull() ) {
			dwitya[top] = value;
			top = top + 1;
		} else {
			System.out.println("Maaf, stack telah penuh!");
		}
	}
	
	public T pop () {
		if ( !isEmpty() ) {
			top = top - 1;
			T r = dwitya[top];
			return r;}
		} else {
			return null;
		}
	}
	
	public T peak() {
		if ( !isEmpty() ) {
			return dwitya[top-1];
		} else {
			return null;
		}
	}
}	