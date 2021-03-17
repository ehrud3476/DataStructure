package week2main;

import java.util.NoSuchElementException;
public class ArrList <E> {
	private  E a[];     // 리스트의 항목들을 저장할 배열
    private  int size;  // 리스트의 항목 수
   
    public  ArrList() { // 생성자
          a = (E[]) new Object[1];
          size = 0;// 항목 수를 0으로 초기화
    }
    public boolean isEmpty() {
    	return size == 0 ; 
} 
    
    public void insertLast(E newItem) {	// 가장 뒤에 새 항목 삽입
    	if(size == a.length)
    		resize(2*a.length);
    	a[size++] = newItem;       
    }
        
    public void insert(E newItem, int k) { // 새 항목을 k-1번 항목 다음에 삽입
    	if(size == a.length)
    		resize(2*a.length);
    	for(int i = size -1 ; i >=k ; i--)
    		a[i+1] = a[i];
    	a[k] = newItem;
    	size++;
    }

    public E delete(int k) {  // k번째 항목 삭제
		if(isEmpty()) throw new NoSuchElementException();
		E item = a[k];
		for(int i = k ; i < size ; i++)
			a[i] = a[i+1];
		size--;
		if(size >0 && size == a.length/4)
			resize(a.length/2);
		return item;
    }
    
    public E peek(int k) {  // k번째 항목을 리턴, 단순히 읽기만 한다.
    	if(isEmpty()) throw new NoSuchElementException();
    	return a[k];
      }
    
    private void resize(int newSize) {		// 배열 크기 조절
		            Object[] t = new Object[newSize];
		            for(int i = 0; i <size ; i++)
		            	t[i] = a[i];
		            a = (E[])t;// 배열 t를 배열 s로 
	}
    
	public void print() { // 배열의 항목들을 출력
		if(isEmpty())
			System.out.print("배열이 비었음");
		else
			for(int i =0 ; i < a.length ; i++)
				System.out.print(a[i] + " \t");
		System.out.println();
	}
}