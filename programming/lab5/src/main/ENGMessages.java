package main;

import command.Command;

import java.util.Map;

public class ENGMessages implements Messages{
    public ENGMessages(Map<String, Command> commands) {
    }

    @Override
    public String getCommands() {
        return "";
    }

    @Override
    public String getInfoAboutWorker() {
        return null;
    }

    @Override
    public String getInputFieldMessage() {
        return null;
    }

    @Override
    public String getInputNameMassage() {
        return null;
    }

    @Override
    public String getInputCoordinatesMassage() {
        return null;
    }

    @Override
    public String getInputXCoordinatesMessage() {
        return null;
    }

    @Override
    public String getInputYCoordinatesMessage() {
        return null;
    }

    @Override
    public String getInputSalaryMessage() {
        return null;
    }

    @Override
    public String getInputEndDateMessage() {
        return null;
    }

    @Override
    public String getInputPositionMessage() {
        return null;
    }

    @Override
    public String getInputStatusMessage() {
        return null;
    }

    @Override
    public String getInputOrganizationMessage() {
        return null;
    }

    @Override
    public String getInputFullNameOrganizationMessage() {
        return null;
    }

    @Override
    public String getInputAnnualTurnoverOrganizationMessage() {
        return null;
    }

    @Override
    public String getInputOfficialAddressMessage() {
        return null;
    }

    @Override
    public String getTryAgainMessage() {
        return null;
    }

    @Override
    public String getInputStreetForAddress() {
        return null;
    }

    @Override
    public String getInputTownX() {
        return null;
    }

    @Override
    public String getInputTownName() {
        return null;
    }

    @Override
    public String getInputTownY() {
        return null;
    }
}
