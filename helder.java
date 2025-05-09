
		
		/*HashMap<String, Double> somaNotas = new HashMap<>();
		HashMap<String, Integer> contagemNotas = new HashMap<>();

		while (true) {
			System.out.println("\n1. Adicionar nota");
			System.out.println("2. Calcular média de um aluno");
			System.out.println("3. Sair");
			System.out.print("Opção: ");
			int opcao = scan.nextInt();
			scan.nextLine(); 

			switch (opcao) {
			case 1:
				System.out.print("Nome do aluno: ");
				String aluno = scan.nextLine();

				System.out.print("Nota: ");
				double nota = scan.nextDouble();
				scan.nextLine();

				somaNotas.put(aluno, somaNotas.getOrDefault(aluno, 0.0) + nota);
				contagemNotas.put(aluno, contagemNotas.getOrDefault(aluno, 0) + 1);

				System.out.println("Nota adicionada.");
				break;

			case 2:
				System.out.print("Nome do aluno: ");
				aluno = scan.nextLine();

				if (somaNotas.containsKey(aluno)) {
					double soma = somaNotas.get(aluno);
					int quantidade = contagemNotas.get(aluno) ;
					double media = soma / quantidade ;
					System.out.printf("Média de %s: %.2f%n", aluno, media);
				} else {
					System.out.println("Aluno não encontrado.");
				}
				break;

			case 3:
				System.out.println("Programa encerrado.");
				return;

			default:
				System.out.println("Opção inválida.");
			}

		}*/
	
		Q:16  
        HashMap<String, String> dicionario = new HashMap<>();

        
        dicionario.put("cachorro", "dog");
        dicionario.put("gato", "cat");
        dicionario.put("livro", "book");
        dicionario.put("maçã", "apple");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Consultar tradução");
            System.out.println("2. Adicionar nova tradução");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scan.nextInt();
            scan.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite a palavra em português: ");
                    String palavra = scan.nextLine();

                    if (dicionario.containsKey(palavra)) {
                        System.out.println("Tradução em inglês: " + dicionario.get(palavra));
                    } else {
                        System.out.println("Palavra não encontrada no dicionário.");
                    }
                    break;

                case 2:
                    System.out.print("Digite a palavra em português: ");
                    palavra = scan.nextLine();

                    System.out.print("Digite a tradução em inglês: ");
                    String traducao = scan.nextLine();

                    dicionario.put(palavra, traducao);
                    System.out.println("Tradução adicionada com sucesso.");
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }	
		


