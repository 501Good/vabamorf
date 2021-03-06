package ee.vabamorf.ooo.linguistic.et;

import com.sun.star.lang.Locale;

public class XSpellAlternatives_impl implements
    com.sun.star.linguistic2.XSpellAlternatives
{
    String      aWord;
    Locale      aLanguage;
    String[]    aAlt;           // list of alternatives, may be empty.
    short       nType;          // type of failure

    public XSpellAlternatives_impl( 
            String      aWord, 
            Locale      aLanguage, 
            short       nFailureType, 
            String[]    aAlt )
    {
        this.aWord      = aWord;
        this.aLanguage  = aLanguage;
        this.aAlt       = aAlt;
        this.nType      = nFailureType;
    
        if (this.aWord == null) this.aWord = new String();
        if (this.aLanguage == null) this.aLanguage = new Locale();
        if (this.aAlt == null) this.aAlt = new String[]{};
    }

	// XSpellAlternatives
    public String getWord() throws com.sun.star.uno.RuntimeException
    {
        return aWord;
    }
    public Locale getLocale() throws com.sun.star.uno.RuntimeException
    {
        return aLanguage;
    }
    public short getFailureType() throws com.sun.star.uno.RuntimeException
    {
        return nType;
    }
    public short getAlternativesCount() throws com.sun.star.uno.RuntimeException
    {
        return (short) aAlt.length;
    }
    public String[] getAlternatives() throws com.sun.star.uno.RuntimeException
    {
        return aAlt;
    }
};
