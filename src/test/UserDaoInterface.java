package test;

public interface UserDaoInterface{
	
	/**
	 * Insertar un conjunto de usuarios en la base de datos
	 * @param users
	 * @return the number of rows inserted
	 */
	
	public int insertAll(User[] users); 
	/**
	 * Transferir dinero de un usuario a otro
	 * @param fromUerId id del enviador
	 * @param toUserId id del recipiente
	 * @param amount la cantidad mandada
	 * @return si se ejecuta exitosamente
	 */
	
	
	public boolean transfer(long fromUerId, long toUserId, float amount);
	
	/**
	 * Transferir dinero de un usuario a otro
	 * @param fromUerId id del enviador
	 * @param toUserId id del recipiente
	 * @param amount la cantidad mandada
	 * @return si se ejecuta exitosamente
	 */
	
	
	public boolean transferWithBatch(long fromUerId, long toUserId, float amount);
	
}
