
package models.ChangesPgn;

public class SavePgn {
    
    Boolean setSavePgn (String pgn, String finalNome) {

//        if (pgn.equals("")) {
//
//            JOptionPane.showMessageDialog(null, "Não há PGN caregado!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
//
//        } else {
//            //finaldonome = JOptionPane.showInputDialog(null, "Como terminou a partida?");
//            finaldonome = JOptionPane.showInputDialog(null, "Qual foi o final?", "Final da partida", 3);
//
//            //INICIO DA ROTINA DE SALVAMENTO
//            if ((txtPecas.getText().equals("BRANCAS")) && !(txtTipo.getText().equals("GME"))) {
//
//                //Cria a janela para salvar arquivo 
//                JFileChooser salvarArquivo = new JFileChooser();
//                //salvarArquivo.setSelectedFile(new File(textoaberturadopgn));
//                salvarArquivo.setSelectedFile(new File(lblSiglaTipo.getText() + lblSiglaPecas.getText() + lblSiglaResultado.getText() + " " + txtSiglaDaAbertura.getText() + " " + aberturaseminiciobrancas + finaldonome.toLowerCase()));
//                salvarArquivo.setAcceptAllFileFilterUsed(false);//Não aparecer arquivos do tipo Todos os Arquivos
//
//                //Filtros de arquivos
//                FileNameExtensionFilter filtro1 = new FileNameExtensionFilter(".pgn", "pgn");
//
//                //Adicionar filtros
//                salvarArquivo.addChoosableFileFilter(filtro1);
//
//                //Mostrar janela Salvar Arquivo
//                salvarArquivo.setName(txtAbertura.getText());
//                salvarArquivo.showSaveDialog(btnSalvar);
//
//                // Selecionar extensão do arquivo
//                if (salvarArquivo.getFileFilter() == filtro1) {
//                    filePath = salvarArquivo.getSelectedFile().getPath().concat(".pgn");
//
//                }
//                try {
//                    //Criar arquivo
//                    File arquivo = new File(filePath);
//                    //Pegar o endereço do arquivo
//                    caminho = Paths.get(arquivo.getAbsolutePath());
//
//                } catch (NullPointerException e1) {
//                    e1.printStackTrace();
//                }
//                //Escrever o texto no arquivo
//                try ( BufferedWriter escrita = Files.newBufferedWriter(caminho, iso_8859_1)) {
//                    escrita.write(txtPgn.getText());
//                    JOptionPane.showMessageDialog(null, "Arquivo salvo!");
//                } catch (IOException | NullPointerException e2) {
//                    e2.printStackTrace();
//                }
//
//                //FIM DA ROTINA DE SALVAMENTO
//            } else if ((txtPecas.getText().equals("PRETAS")) && !(txtTipo.getText().equals("GME"))) {
//                //Cria a janela para salvar arquivo 
//                JFileChooser salvarArquivo = new JFileChooser();
//                //salvarArquivo.setSelectedFile(new File(textoaberturadopgn));
//                salvarArquivo.setSelectedFile(new File(lblSiglaTipo.getText() + lblSiglaResultado.getText() + " " + txtSiglaDaAbertura.getText() + " " + txtAbertura.getText() + finaldonome));
//                salvarArquivo.setAcceptAllFileFilterUsed(false);//Não aparecer arquivos do tipo Todos os Arquivos
//
//                //Filtros de arquivos
//                FileNameExtensionFilter filtro1 = new FileNameExtensionFilter(".pgn", "pgn");
//
//                //Adicionar filtros
//                salvarArquivo.addChoosableFileFilter(filtro1);
//
//                //Mostrar janela Salvar Arquivo
//                salvarArquivo.setName(txtAbertura.getText());
//                salvarArquivo.showSaveDialog(btnSalvar);
//
//                // Selecionar extensão do arquivo
//                if (salvarArquivo.getFileFilter() == filtro1) {
//                    filePath = salvarArquivo.getSelectedFile().getPath().concat(".pgn");
//
//                }
//                try {
//                    //Criar arquivo
//                    File arquivo = new File(filePath);
//                    //Pegar o endereço do arquivo
//                    caminho = Paths.get(arquivo.getAbsolutePath());
//
//                } catch (NullPointerException e1) {
//                    e1.printStackTrace();
//                }
//                //Escrever o texto no arquivo
//                try ( BufferedWriter escrita = Files.newBufferedWriter(caminho, iso_8859_1)) {
//                    escrita.write(txtPgn.getText());
//                    JOptionPane.showMessageDialog(null, "Arquivo salvo!");
//                } catch (IOException | NullPointerException e2) {
//                    e2.printStackTrace();
//                }
//
//                //FIM DA ROTINA DE SALVAMENTO
//            } else if (((txtPecas.getText().equals("BRANCAS")) || (txtPecas.getText().equals("PRETAS"))) && (txtTipo.getText().equals("GME"))) {
//
//                //Cria a janela para salvar arquivo 
//                JFileChooser salvarArquivo = new JFileChooser();
//                //salvarArquivo.setSelectedFile(new File(textoaberturadopgn));
//                salvarArquivo.setSelectedFile(new File(lblSiglaTipo.getText() + " " + txtSiglaDaAbertura.getText() + " " + txtAbertura.getText() + finaldonome));
//                salvarArquivo.setAcceptAllFileFilterUsed(false);//Não aparecer arquivos do tipo Todos os Arquivos
//
//                //Filtros de arquivos
//                FileNameExtensionFilter filtro1 = new FileNameExtensionFilter(".pgn", "pgn");
//
//                //Adicionar filtros
//                salvarArquivo.addChoosableFileFilter(filtro1);
//
//                //Mostrar janela Salvar Arquivo
//                salvarArquivo.setName(txtAbertura.getText());
//                salvarArquivo.showSaveDialog(btnSalvar);
//
//                // Selecionar extensão do arquivo
//                if (salvarArquivo.getFileFilter() == filtro1) {
//                    filePath = salvarArquivo.getSelectedFile().getPath().concat(".pgn");
//
//                }
//                try {
//                    //Criar arquivo
//                    File arquivo = new File(filePath);
//                    //Pegar o endereço do arquivo
//                    caminho = Paths.get(arquivo.getAbsolutePath());
//
//                } catch (NullPointerException e1) {
//                    e1.printStackTrace();
//                }
//                //Escrever o texto no arquivo
//                try ( BufferedWriter escrita = Files.newBufferedWriter(caminho, iso_8859_1)) {
//                    escrita.write(txtPgn.getText());
//                    JOptionPane.showMessageDialog(null, "Arquivo salvo!");
//                } catch (IOException | NullPointerException e2) {
//                    e2.printStackTrace();
//                }
//
//                //FIM DA ROTINA DE SALVAMENTO
//            } else {
//                JOptionPane.showMessageDialog(null, "Cancelado!");
//            }
//        }
        
        return false;
    }
    
}
