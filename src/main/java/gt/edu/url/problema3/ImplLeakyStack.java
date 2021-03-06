package gt.edu.url.problema3;

public class ImplLeakyStack<E>  extends CircularLinkedList<E> implements LeakyStack<E> {

	private int limite;
	
	public ImplLeakyStack(int limite) {
		super();
		this.limite = limite;
	}

	@Override
	public E saveHistory(E e) {
		E auxiliar = (E) new Animal((Animal)e);	
                int cont = 0;
		
			if(cont < limite) {
				addLast(auxiliar);
                                return auxiliar;
			}else {
				removeFirst();
				addLast(auxiliar);
                                return auxiliar;
			}                       	
	}

	@Override
	public E actual() {
		return last();		
	}
	
	@Override
	public E undo() {
            if (this.size() == 0) 
                throw new IllegalArgumentException("Argumento invalido");
            rotate();
            return removeFirst();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		return super.first();
	}

	@Override
	public E last() {
		// TODO Auto-generated method stub
		return super.last();
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		super.rotate();
	}

	@Override
	public void addFirst(E e) {
		// TODO Auto-generated method stub
		super.addFirst(e);
	}

	@Override
	public void addLast(E e) {
		// TODO Auto-generated method stub
		super.addLast(e);
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return super.removeFirst();
	}	

}
