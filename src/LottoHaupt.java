import java.util.HashSet;
import java.util.Set;

public class LottoHaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> lotto = new HashSet<Integer>();
		int x = 0;
		
		while(lotto.size() < 7) {
			lotto.add(1 + (int) (Math.random()*49));
		}
		
		System.out.println(lotto);
	}
}
