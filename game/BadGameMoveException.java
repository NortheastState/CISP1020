package game;

public class BadGameMoveException extends Exception
{
	private String badMove;
	
	public BadGameMoveException(String msg)
	{
		super(msg);
	}
	
	public BadGameMoveException(String badMove, String msg)
	{
		super(msg);
		this.badMove = badMove;
	}
	
	public String badMove()
	{
		return badMove;
	}
	
}
