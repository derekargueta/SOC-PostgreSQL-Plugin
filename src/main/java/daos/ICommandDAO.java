package daos;

import server.persistence.dto.CommandDTO;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Kyle 'TMD' Cornelison on 4/5/2016.
 */
public interface ICommandDAO {
    /**
     * Handles adding a user,
     * adding a command
     * adding a game
     * @param dto
     */
    void addCommand(CommandDTO dto) throws SQLException, UnsupportedEncodingException;

    /**
     * Handles verifying user which returns userID
     * Getting the current game model
     * getting a list of Commands
     * @return
     */
    List<CommandDTO> getCommands(int gameID) throws SQLException, UnsupportedEncodingException;

    List<CommandDTO> getAllCommands() throws SQLException, UnsupportedEncodingException;

    /**
     * mostly be used for updating the game blob state
     */
    void deleteAllCommands() throws SQLException;

    /**
     * Mostly be used for deleting commands every n
     * moves.
     */
    void deleteCommandsFromGame(int gameID) throws SQLException;
}
