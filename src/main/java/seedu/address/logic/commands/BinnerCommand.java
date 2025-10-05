package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Changes the existing person to a binner in the address book.
 */
public class BinnerCommand extends Command {

    public static final String COMMAND_WORD = "binner";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult("Hello from binner");
    }
}