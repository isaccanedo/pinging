# pinging
PING significa Packet InterNet Groper no campo de redes de computadores. É um software de administração de rede de computadores usado para testar a acessibilidade de um host em uma rede IP. Ele mede o tempo de ida e volta para mensagens enviadas do host de origem para um computador de destino que são repetidas na origem.

O ping opera enviando pacotes de solicitação de eco do protocolo ICMP / ICMP6 (Internet Control Message Protocol) para o host de destino e aguardando uma resposta de eco do ICMP. O programa relata erros, perda de pacotes e um resumo estatístico dos resultados.

Protocolo de mensagens de controle da Internet (ICMP): O protocolo de mensagens de controle da Internet (ICMP) suporta o protocolo no conjunto de protocolos da Internet. É usado por dispositivos de rede, como roteadores, para enviar mensagens de erro e informações operacionais indicando se uma solicitação de serviço está disponível ou não ou se um host ou roteador não pôde ser alcançado.
O ICMP difere dos protocolos de transporte, como TCP e UDP, pois geralmente não é usado para trocar dados entre sistemas.
O ICMP não é suportado em Java e o ping em Java, pois depende do ICMP.
Não podemos simplesmente executar ping em Java, pois ele depende do ICMP, que infelizmente não é suportado em Java.
