import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Block 
{
	public static final int BLOCK_SIZE = 0;
	private long id;
	private int dataCounter;
	private MerkleTree data;
	
	// header information
	private int version;
	private String prevHash;
	private String timestamp;
	
	public Block(String rawBlock)
	{
		
	}
	
	public String getTimestamp()
	{
		return timestamp;
	}
	
	public long getId()
	{
		return id;
	}

	public String getHash() 
	{
		// SHA512
		return null;
	}
	
	public String getPreviousHash()
	{
		return prevHash;
	}
	
	public void setPreviousHash(String prevHash)
	{
		this.prevHash = prevHash;
	}
	
	public boolean isGenesis()
	{
		return (id == 0);
	}
}
