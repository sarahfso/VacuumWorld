public class VacuumWorld {
	public static void main(String[] args) throws InterruptedException {
        
        ///////////////////////////////////////////////////////////////
        //DEFINA O AMBIENTE 
        Environment environment = new Environment(true, true, true);
        
        //
        //DEFINA NUMERO DE PASSOS 
		int n = 5;
		////////////////////////////////////////////////////////////////

		Agent agent = new Agent();
        Perception perception;
        perception = agent.perceives(environment);
        Action action;
		
        System.out.println("Dispositivo iniciado...");
        Thread.sleep(1000);

		for(int i=0; i < n; i++) {	
			System.out.print("Está em ");
            if(perception.location()==true)
                System.out.println("Sala A");
            else
                System.out.println("Sala B");
            Thread.sleep(1000);

            System.out.print("Situação: ");
            if(perception.isDirty()==true)
                System.out.println("Suja");
            else
                System.out.println("Limpa");
            Thread.sleep(1000);

            action = agent.act();
            System.out.println("Ação: " + action.getName());
            Thread.sleep(1000);

            agent.execute(action,environment);
            System.out.println("Ação concluída");
            Thread.sleep(1000);

			perception = agent.perceives(environment);
		}

        //
	}

}