# Plataforma Healthcare com Arquitetura de Microserviços em Java

## Objetivo
Desenvolver uma plataforma de healthcare que permita a gestão de pacientes, agendamentos de consultas, prontuários eletrônicos e faturamento. O sistema foi construído utilizando uma arquitetura de microserviços em Java, utilizando como padrão de projeto a arquitetura de camadas: Controllers, Entidades, Repository, DTO e Services.

## Componentes do Sistema

### Serviço de Gestão de Pacientes
- **Função**: Gerenciar os dados dos pacientes.
- **Funcionalidades**:
  - Registrar, atualizar, remover e listar pacientes.

### Serviço de Agendamento
- **Função**: Gerenciar os agendamentos de consultas.
- **Funcionalidades**:
  - Criar, atualizar, cancelar e listar agendamentos.
  - Incluir um paciente no agendamento.
  - Verificar se a data e hora escolhida está disponível.

### Serviço de Prontuário Eletrônico
- **Função**: Gerenciar os prontuários eletrônicos dos pacientes.
- **Funcionalidades**:
  - Adicionar, atualizar, remover e listar registros médicos.
  - Incluir nome do paciente, registros médicos, data de entrada, data de alta, convênio, etc.

### Serviço de Prescrições Médicas
- **Função**: Gerenciar prescrições de medicamentos.
- **Funcionalidades**:
  - Criar, atualizar, cancelar e listar prescrições.
  - Para cada paciente, podem ser prescritos mais de um medicamento.

### Serviço de Faturamento e Seguradoras
- **Função**: Gerenciar o faturamento da conta do paciente.
- **Funcionalidades**:
  - Criar uma conta do paciente, onde terá o registro de todos os materiais, medicamentos e procedimentos utilizados.
  - Cada item terá um preço, e o valor total da conta será a soma de todos os itens.

## Tabelas Adicionais
- Medicamento
- Procedimento
- Material
- Médico
- Convênio
