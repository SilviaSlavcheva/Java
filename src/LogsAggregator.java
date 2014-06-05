import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
public class LogsAggregator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String s = input.nextLine();
		Map<String, TreeMap<String, Integer>> map = new TreeMap<String, TreeMap<String, Integer>>();
		Map<String, Integer> innerMap = new TreeMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String str = input.nextLine();
			String[] logs = str.split(" ");
			int sum = 0;
			for(int value : innerMap.values()) {
				 sum = sum + value;
			}
				innerMap.put(logs[0], Integer.parseInt(logs[2]));
				for(int value : innerMap.values()) {
					 sum = sum + value;
				}
				innerMap.put(logs[0], sum);
				map.put(logs[1], (TreeMap<String, Integer>) innerMap);
			
		}
		for(Entry<String, TreeMap<String, Integer>> st : map.entrySet()) {
			for (Entry<String, Integer> se : innerMap.entrySet()) {

			System.out.printf("%1$s: %2$d [%3$s]",  st.getKey(), se.getValue(), se.getKey());
			System.out.println();
			}
		}
	}

}
