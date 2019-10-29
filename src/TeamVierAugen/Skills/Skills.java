
/**
 * Authors: Lincoln Schroeder
 *
 * Commenter: Zexin Liu
 *
 * Purpose: This class defines the enumerations for skill types.
 */
package TeamVierAugen.Skills;
import TeamVierAugen.Utils;

public enum Skills
{
    ROCK_THROW,
    SCISSORS_POKE,
    PAPER_CUT,
    SHOOT_THE_MOON,
    REVERSAL_OF_FORTUNE;

    @Override
    public String toString()
    {
        return Utils.convertEnumString(this.name());
    }

}
