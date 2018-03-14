package game;

public class Player
{
	private Node currentNode;
	private double health;
	
	public Player(Node currentNode, double health)
	{
		this.currentNode = currentNode;
		this.health = health;
	}

	public Node getCurrentNode()
	{
		return currentNode;
	}
	
	private void setHealth(double health)
	{
		this.health = health;
	}
	
	public double getHealth()
	{
		return health;
	}
	
	public void takeDamage(double damage)
	{
		double damageTaken = health - damage;
		setHealth(damageTaken);
	}
	
	public void addHealth(double heal)
	{
		double healthAdded = health + heal;
		if(health > 1000)
		{
			setHealth(1000);
		}
		else
		{
			setHealth(healthAdded);
		}
	}
	
	public boolean checkDead()
	{
		if(health <= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void setCurrentNode(Node currentNode)
	{
		this.currentNode = currentNode;
	}
	
	@Override
	public String toString() {
		return "\nPlayer [currentNode=" + currentNode;// + "\nPlayer hardware=" + hardware + "\nPlayer health=" + health + "]";
	}
}
