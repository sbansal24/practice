package DesignPatterns.Command;

public class CommandUtil {
    public static CommandReceiver getCommandReceiver(RemoteType remoteType) {
        switch (remoteType) {
            case TV:
                return new TvRemoteCommandSystem();
            case STB:
                return new SetTopBoxCommandSystem();
            default:
                throw new RuntimeException("wrong remote type");
        }

    }
}
