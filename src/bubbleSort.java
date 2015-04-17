import java.util.ArrayList;


public class bubbleSort {
	private int counter = 0;
	public ArrayList sort(ArrayList<? extends Number> array){
		for (Number numero: array){
			counter++;
			if (numero.doubleValue() > array.get(counter).doubleValue()){
				//if the first number is larger than the second one
				Number temp = numero;
				numero = array.get(counter);
				array.set(counter,getValue(temp));
			}
		}
		return array;
	}
	public Number getValue(Number numValue){
		if (numValue instanceof Integer){
			return numValue.intValue();
		}else if (numValue instanceof Double){
			return numValue.doubleValue();
		}else if (numValue instanceof Byte){
			return numValue.byteValue();
		}else if (numValue instanceof Float){
			return numValue.floatValue();
		}else if (numValue instanceof Short){
			return numValue.shortValue();
		}else{
			return numValue.longValue();
		}//can be expanded for additional Number subclasses		
	}
	
}
