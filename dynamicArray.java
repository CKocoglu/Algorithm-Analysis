import java.util.Arrays;

public class dynamicArray {
	private Object array[];
	private int size;
	private int capacity;
	
	public dynamicArray() {
		array = new Object[1];
		size=0;
		capacity=1;
		System.out.println("--Object created--\n size="+size+"  capacity="+capacity);
	}
	
	public void append(Object element) {
		if(size == capacity) {
			resize();
		}
		array[size] = element;
		size++;
		System.out.println("Added element:"+element);
	}
	
	public void remove() {
		if(size!=0) {
			System.out.println("Deleted element:"+array[size-1]);
			array[size-1]=null;  //-1 çünkü 0 dan baslýyor.
			
			size--;
		}
	}
	
	public void resize() {
		System.out.print("Capacity is incresed by 2.---");
		Object templist[]=new Object[capacity+2];
		for(int i=0;i < capacity; i++) {
			templist[i]=array[i];  // eleman aktarýmý
		}
		array=templist; // tekrar eski listemiz ama capacity 2 artýrýlmýs hali ve elemanlar ayný.
		capacity=capacity+2;
		System.out.println("New capacity="+capacity);
	}
	public void print_elements() {
		System.out.println(Arrays.toString(array));
	}
	

	
	//Get - Set
	public Object[] getArray() {
		return array;
	}

	public void setArray(Object[] array) {
		this.array = array;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
