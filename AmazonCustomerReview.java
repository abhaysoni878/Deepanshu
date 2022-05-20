import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {
	public static List<List<String>> searchSuggestions(List<String> repository, String CustomerQuery) {
		List<List<String>> returnValue = new ArrayList<>();
		List<String>SortedRepository = new ArrayList<>();
		for(String word: repository) {
			SortedRepository.add(word.toLowerCase());
		}
		Collections.sort(SortedRepository);
		for(int i=2;i<= CustomerQuery.length();i++)
		{
			String tempQuery = CustomerQuery.substring(0,i).toLowerCase();
			List<String>Singlepassresult = new ArrayList<>();
			for(String word: SortedRepository) {
				if(word.startsWith(tempQuery) && Singlepassresult.size()<3) {
					Singlepassresult.add(word);
				}
			}
			returnValue.add(Singlepassresult);
		}
		return returnValue;
	}
}

public class AmazonCustomerReview {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int repositoryCount = Integer.parseInt(bufferedReader.readLine().trim());
		List<String> repository = IntStream.range(0,repositoryCount).mapToObj (i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.collect(toList());
		String CustomerQuery = bufferedReader.readLine();
		List<List<String>> result = Result.searchSuggestions(repository, CustomerQuery);
		
		 result.stream()
		 
		 .map(
				r -> r.stream()
				.collect(joining(" "))
		)
		.map(r -> r + "\n")
		.collect(toList())
		.forEach(e -> {
			try {
				bufferedWriter.write(e);
			} catch (IOException ex) {
				throw new RuntimeException (ex);
			}
		});
		bufferedReader.close();
		bufferedWriter.close();
		//System.out.println("Hello");
		// TODO Auto-generated method stub

	}
}
