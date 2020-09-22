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
		lookandSay.lookANdSay(15);
	}

	public void lookANdSay(int count)
	{
		int totlaVal = 1;
		String value = "1";
		while (count > 0)
		{
			System.out.println(totlaVal+": "+value);
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
			count--;
			totlaVal++;

		}

	}
}
