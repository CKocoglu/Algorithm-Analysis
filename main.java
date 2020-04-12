public class main {

	public static void main(String[] args) {
		dynamicArray array = new dynamicArray(); 
		
		array.append("elma");
		array.append(3);
		array.append(1);
		array.append(4);
		array.append("muz");

		array.print_elements();
		
		array.remove();
		array.remove();
		array.remove();
		array.remove();
		array.remove();
		
		array.append("karpuz");

		
		array.print_elements();


	}

}
