INSERT INTO tb_client(name, email) VALUES ('Rafael', 'rafaelcaputodev@gmail.com');

INSERT INTO tb_order(moment, status) VALUES (NOW(), 1);

INSERT INTO tb_order_item(order_id,quantity, price) VALUES (1, 1, 2000.00);

INSERT INTO tb_product(order_item_id, name,price) VALUES (1, 'Iphone', 1050.00);