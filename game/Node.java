package game;

import java.util.ArrayList;

public class Node
{
	// declare/define attributes here or in constructors, just be consistent
	private int xLocation = 0;
	private int yLocation = 0;
	private int nodeID = 0;
	private String nodeName = "";
	private String nodeDescription = "";
	private ArrayList<Node> connectors = new ArrayList<Node>();
	private byte thisByte = 0b00000000;
	private byte bitDirections = 0b00000000; // use bitwise operations | = OR; & = AND

	public Node(int xLocation, int yLocation, int nodeID, String nodeName, String nodeDescription)
	{
		super();
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.nodeID = nodeID;
		this.nodeName = nodeName;
		this.nodeDescription = nodeDescription;
	}

	public Node(Node node)
	{
		super();
		this.xLocation = node.getxLocation();
		this.yLocation = node.getyLocation();
		this.nodeID = node.getNodeID();
		this.nodeName = node.getNodeName();
		this.nodeDescription = node.getNodeDescription();
		for (Node myNode : node.getConnectors())
		{
			connectors.add(new Node(myNode));
		}

	}

	public void addConnection(Node connector)
	{
		getConnectorDirection(connector);
		connectors.add(connector);
	}

	public int isValidDirection(String direction)
	{
		int nodeByteCode = -1;
		// check direction to be valid for this node
		if (direction.equals("North"))
		{
			if ((bitDirections & 0b10000000) == 0x80) // 64)
			{
				nodeByteCode = getDestinationNodeID((byte) 0x80);
			}
		} else if (direction.equals("North East"))
		{
			if ((bitDirections & 0b01000000) == 0x40) // 64)
			{
				nodeByteCode = getDestinationNodeID((byte) 0x40);
			}
		} else if (direction.equals("East"))
		{
			if ((bitDirections & 0b00100000) == 0x20) // 64)
			{
				nodeByteCode = getDestinationNodeID((byte) 0x20);
			}
		} else if (direction.equals("South East"))
		{
			if ((bitDirections & 0b00010000) == 0x10) // 64)
			{
				nodeByteCode = getDestinationNodeID((byte) 0x10);
			}
		} else if (direction.equals("South"))
		{
			if ((bitDirections & 0b00001000) == 0x08) // 64)
			{
				nodeByteCode = getDestinationNodeID((byte) 0x08);
			}
		} else if (direction.equals("South West"))
		{
			if ((bitDirections & 0b00000100) == 0x04) // 64)
			{
				nodeByteCode = getDestinationNodeID((byte) 0x04);
			}
		} else if (direction.equals("West"))
		{
			if ((bitDirections & 0b00000010) == 0x02) // 64)
			{
				nodeByteCode = getDestinationNodeID((byte) 0x02);
			}
		} else if (direction.equals("North West"))
		{
			if ((bitDirections & 0b00000001) == 0x01) // 64)
			{
				nodeByteCode = getDestinationNodeID((byte) 0x01);
			}
		}
		return nodeByteCode;
	}

	private int getDestinationNodeID(byte nodeCode)
	{
		int nodeID = -1;
		for (Node node : connectors)
		{
			if (node.getThisByte() == nodeCode)
			{
				nodeID = node.getNodeID();
			}
		}
		return nodeID;
	}

	public String compileDirections()
	{
		StringBuilder directions = new StringBuilder();

		for (Node connector : connectors)
		{
			directions.append(getConnectorDirection(connector));
			directions.append(", ");
		}
		return directions.toString();
	}

	private String getConnectorDirection(Node connector)
	{
		int xLoc = connector.getxLocation();
		int yLoc = connector.getyLocation();
		int xDelta = xLoc - xLocation;
		int yDelta = yLoc - yLocation;
		String vectorDir = getVectorDir(connector, xDelta, yDelta);
		return vectorDir;
	}

	private String getVectorDir(Node node, int xDelta, int yDelta)
	{
		String dir = "";
		if (xDelta == 0 && yDelta >= 1)
		{
			dir = "North";
			bitDirections = (byte) (bitDirections | 0b10000000);
			node.setThisByte((byte) 0b10000000);
		} else if (xDelta == 0 && yDelta <= -1)
		{
			dir = "South";
			bitDirections = (byte) (bitDirections | 0b00001000);
			node.setThisByte((byte) 0b00001000);
		} else if (xDelta >= 1 && yDelta >= 1)
		{
			dir = "North East";
			bitDirections = (byte) (bitDirections | 0b01000000);
			node.setThisByte((byte) 0b01000000);
		} else if (xDelta <= -1 && yDelta <= -1)
		{
			dir = "South West";
			bitDirections = (byte) (bitDirections | 0b00000100);
			node.setThisByte((byte) 0b00000100);
		} else if (xDelta >= 1 && yDelta <= -1)
		{
			dir = "South East";
			bitDirections = (byte) (bitDirections | 0b00010000);
			node.setThisByte((byte) 0b00010000);
		} else if (xDelta <= -1 && yDelta >= 1)
		{
			dir = "North West";
			bitDirections = (byte) (bitDirections | 0b00000001);
			node.setThisByte((byte) 0b00000001);
		} else if (xDelta >= 1 && yDelta == 0)
		{
			dir = "East";
			bitDirections = (byte) (bitDirections | 0b00100000);
			node.setThisByte((byte) 0b00100000);
		} else if (xDelta <= 1 && yDelta == 0)
		{
			dir = "West";
			bitDirections = (byte) (bitDirections | 0b00000010);
			node.setThisByte((byte) 0b00000010);
		} else
		{
			dir = "ERROR";
		}
		return dir;
	}

	// getters and setters
	public int getxLocation()
	{
		return xLocation;
	}

	public void setxLocation(int xLocation)
	{
		this.xLocation = xLocation;
	}

	public int getyLocation()
	{
		return yLocation;
	}

	public void setyLocation(int yLocation)
	{
		this.yLocation = yLocation;
	}

	public int getNodeID()
	{
		return nodeID;
	}

	public void setNodeID(int nodeID)
	{
		this.nodeID = nodeID;
	}

	public String getNodeName()
	{
		return nodeName;
	}

	public void setNodeName(String nodeName)
	{
		this.nodeName = nodeName;
	}

	public String getNodeDescription()
	{
		return nodeDescription;
	}

	public void setNodeDescription(String nodeDescription)
	{
		this.nodeDescription = nodeDescription;
	}

	public byte getThisByte()
	{
		return thisByte;
	}

	public void setThisByte(byte thisByte)
	{
		this.thisByte = thisByte;
	}

	public ArrayList<Node> getConnectors()
	{
		return connectors;
	}

	public byte getBitDirections()
	{
		return bitDirections;
	}

	@Override
	public String toString()
	{
		return "Node: " + nodeName + " - Description: " + nodeDescription + "\nPaths leading: " + compileDirections();
	}
}
