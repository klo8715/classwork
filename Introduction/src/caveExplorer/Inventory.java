package caveExplorer;

public class Inventory {
	private boolean hasMap;
	private String map;
	public Inventory()
	{
		hasMap=true;
		updateMap(); 
	}
	private void updateMap()
	{
		map = " ";
		for (int i=0; i<CaveExplorer.caves[0].length - 1; i++)
		{
			map += "____";
			
		}
		map +="___";
		for(caveRoom[] row: CaveExplorer.caves)
		{
			for(int i=0; i<3;i++)
			{
				String text="";
				for (caveRoom cr:row)
				{
					text +="|";
					if(cr.getDoor(caveRoom.WEST) != null &&
							cr.getDoor(caveRoom.WEST).isOpen())
							{
								text = " ";
							}
					if(i == 0)
					{
						text ="   ";
						
					}
					else if (i==1)
					{
						text += " " + cr.getContents()+ " ";
						
					}
					else if (cr.getDoor(caveRoom.SOUTH)!= null &&
							cr.getDoor(caveRoom.SOUTH).isOpen())
							{
								text ="   ";
							}
					
				}
			}
			text +="|";
			map += text+"\n";
			
		}
		
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		if(hasMap)
		{
			return map;
			
		}
		else
		{
			return "There is nothing in your inventory";
		}
		
	}
	public void setMap(boolean b)
	{
		hasMap = b;
	}
}

