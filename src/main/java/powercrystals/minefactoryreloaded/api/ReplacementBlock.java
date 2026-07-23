package powercrystals.minefactoryreloaded.api;

import net.minecraft.block.Block;

public class ReplacementBlock
{
	public int blockId;
	public int meta;

	public ReplacementBlock(int blockId, int meta)
	{
		this.blockId = blockId;
		this.meta = meta;
	}

	public ReplacementBlock(Block block)
	{
		this.blockId = Block.getIdFromBlock(block);
		this.meta = 0;
	}

	public ReplacementBlock(Block block, int meta)
	{
		this.blockId = Block.getIdFromBlock(block);
		this.meta = meta;
	}

	public ReplacementBlock setMeta(int meta)
	{
		this.meta = meta;
		return this;
	}
}
