package paragraph21;

public class LiftOff implements Runnable
{
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	public LiftOff(){}
	public LiftOff(int countDown)
	{
		this.countDown = countDown;
	}
	
	public String status()
	{
		return "#" + id + "(" +
	           (countDown > 0 ? countDown : "LiftOff!") + "),";
	}
	
	public void run()
	{
		while(countDown-- > 0)
		{
			System.out.println(status());
			Thread.yield();
			System.out.println("陈可昕我想和你一起跑步！");
			
			System.out.println("我似乎开始找到了自己的方向");
		}
	}

}
