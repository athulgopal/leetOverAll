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
		lookandSay.lookANdSay(10);
	}

	public void lookANdSay(int count)
	{
		String value = "1";
		System.out.println(value + "  ");
		while (count > 1)
		{
			char[] arr = value.toCharArray();
			value = "";
			int valCount = 0;
			int prev = arr[0] - 48;
			for (int i = 0; i < arr.length; i++)
			{

				if (prev == (arr[i] - 48))
				{
					valCount++;
				}
				else
				{
					value = value + valCount;
					value = value + (arr[i - 1] - 48);
					prev = arr[i] - 48;
					valCount = 1;
				}
			}

			value = value + valCount;
			value = value + prev;
			System.out.println(value + "  ");
			count--;

		}

	}
}
