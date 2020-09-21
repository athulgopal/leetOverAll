package fb.leet;

//Implement a function that outputs the Look and Say sequence:
//1
//11
//21
//1211
//111221
//312211
//13112221
//1113213211
//31131211131221
//13211311123113112211

public class LookandSay
{
	public static void main(String[] args)
	{
		LookandSay lookandSay = new LookandSay();
		lookandSay.lookANdSay(6);
	}

	public void lookANdSay(int count)
	{

		String value = "1";
		System.out.println(value + "  ");
		while (count > 1)
		{
			char[] arr = value.toCharArray();
			int valCount = 0;
			int result = 0;
			int prev = arr[0] - 48;
			for (int i = 0; i < arr.length; i++)
			{

				if (prev == (arr[i] - 48))
				{
					valCount++;
				}
				else
				{
					result = result * 10 + valCount;
					result = result * 10 + (arr[i - 1] - 48);
					prev = arr[i] - 48;
				}
			}

			result = result * 10 + valCount;
			result = result * 10 + prev;

			value = result + "";
			System.out.println(result + "  ");
			count--;

		}

	}
}
