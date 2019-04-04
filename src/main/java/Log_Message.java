public class Log_Message
{
    public String machineId;
    public String description;

    public Log_Message(String message)
    {
        machineId = message.substring(0, message.indexOf(":"));
        description = message.substring(message.indexOf(":")+1);
    }

    public boolean conainsWord(String keyword)
    {
        if (description.length() >= keyword.length())
        {
            if (description.trim(),equals(keyword))
        }

    }


}
