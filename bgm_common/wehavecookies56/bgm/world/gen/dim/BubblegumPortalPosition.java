package wehavecookies56.bgm.world.gen.dim;
import net.minecraft.util.ChunkCoordinates;
/**
 * Bubblegum Mod
 * 
 * BubblegumPortalPosition
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BubblegumPortalPosition extends ChunkCoordinates
{
public long field_85087_d;
final BubblegumTeleporter field_85088_e;
public BubblegumPortalPosition(BubblegumTeleporter bubblegumTeleporter, int par2, int par3, int par4, long par5)
{
super(par2, par3, par4);
this.field_85088_e = bubblegumTeleporter;
this.field_85087_d = par5;
}
}