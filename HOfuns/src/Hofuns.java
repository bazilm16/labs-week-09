import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;

interface Function<T, U>{
	public U apply(T t);
}

interface anotherFunction<T, U>{
	public U gobber(T t);
}

class cellsToFarFunction implements Function<Integer, Integer>{
	public Integer apply(Integer x){
		return (int)(x * 1.8 + 32);
	}
}


public class Hofuns {
	
	public static <T, U>  List<U> map(Function<T, U> f, List<T> l){
		List<U> ret = new LinkedList<>();
		for(T t: l){
			ret.add(f.apply(t));
		}
		return ret;
	}
	
	public static <T, U>  List<U> map2(Function<T, U> f, List<T> l){
		List<U> ret = new LinkedList<>();
		for(T t: l){
			ret.add(f.apply(t));
		}
		return ret;
	}

	public static List<Integer> clelstofars(List<Integer> l){
		return map(cel -> (int) (cel * 1.8 + 32), l);
	}
	
	
	public static List<String> removeWhiteSpace(List<String> l){
		List<String> ret = new LinkedList<>();
		for (String s : l){
			ret.add(s.trim());
		}
		return ret;
	}
	
	public static <T> List<T> filter(Function<T, Boolean> pred, List<T> l){
		List<T> ret = new LinkedList<>();
		for(T t: l){
			if(pred.apply(t)){
				ret.add(t);
				
				
			}
		}
		return ret;
	}
	
	public static <T, U> U reduce(BiFunction<U, T, U> f, U initial, List<T> l){
		U ret = initial;
		for(T t:l){
			ret = f.apply(ret,  t);
		}
		return ret;
		
	}

}
