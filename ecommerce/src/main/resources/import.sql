insert into categorias (nome, descricao) values ('Livros', 'Livros Técnicos');
insert into categorias (nome, descricao) values ('Eletrônicos', 'Equipamentos Eletronicos');
insert into categorias (nome, descricao) values ('Escritorio', 'Material de escritorio');
insert into categorias (nome, descricao) values ('Games', 'Jogos e Consoles');
insert into categorias (nome, descricao) values ('Casa', 'Utensilios Domesticos');

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('codigo limpo', 'livro do autor robert martin', 73.44, 20, 1);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Mouse Gamer', 'Mouse com fio RGB 6 botoes', 89.90, 50, 2);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Caderno Universitario', 'Caderno 200 folhas capa dura', 24.90, 100, 3);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Controle Sem Fio', 'Controle compativel com PC e console', 199.90, 30, 4);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Panela de Pressao', 'Panela de pressao 4.5 litros', 149.90, 15, 5);

insert into cliente (nome, email, telefone) values ('Maria Silva', 'maria.silva@email.com', '11987654321');
insert into cliente (nome, email, telefone) values ('João Souza', 'joao.souza@email.com', '11912345678');
insert into cliente (nome, email, telefone) values ('Ana Pereira', 'ana.pereira@email.com', '11998765432');
insert into cliente (nome, email, telefone) values ('Carlos Lima', 'carlos.lima@email.com', '11976543210');
insert into cliente (nome, email, telefone) values ('Fernanda Costa', 'fernanda.costa@email.com', '11965432109');

insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-15 10:30:00', 'CONCLUIDO', 73.44, 1);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-16 11:00:00', 'CONCLUIDO', 89.90, 2);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-17 09:45:00', 'CONCLUIDO', 24.90, 3);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-18 14:15:00', 'PENDENTE', 199.90, 4);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-09-19 16:20:00', 'CONCLUIDO', 149.90, 5);

insert into itempedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 73.44, 1, 1);
insert into itempedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 89.90, 2, 2);
insert into itempedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 24.90, 3, 3);
insert into itempedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 199.90, 4, 4);
insert into itempedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 149.90, 5, 5);

insert into pagamento (valor, data, status, tipo, pedido_id) values (73.44, '2026-09-15 10:35:00', 'APROVADO', 'CARTAO_CREDITO', 1);
insert into pagamento (valor, data, status, tipo, pedido_id) values (89.90, '2026-09-16 11:05:00', 'APROVADO', 'PIX', 2);
insert into pagamento (valor, data, status, tipo, pedido_id) values (24.90, '2026-09-17 09:50:00', 'APROVADO', 'BOLETO', 3);
insert into pagamento (valor, data, status, tipo, pedido_id) values (199.90, '2026-09-18 14:20:00', 'PENDENTE', 'CARTAO_CREDITO', 4);
insert into pagamento (valor, data, status, tipo, pedido_id) values (149.90, '2026-09-19 16:25:00', 'APROVADO', 'PIX', 5);