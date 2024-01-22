INSERT INTO saeb.tb_dependencia_administrativa(
	id_dependencia_administrativa, no_dependencia_administrativa)
	VALUES (1, 'Federal'),
	       (2, 'Estadual'),
	       (3, 'Municipal'),
		   (4, 'Privada');
	
INSERT INTO saeb.tb_localizacao(
	id_localizacao, no_localizacao)
	VALUES (1, 'Urbana'),
	 	   (2, 'Rural');
	
INSERT INTO saeb.tb_area(
	id_area, no_area)
	VALUES (1, 'Capital'),
		   (2, 'Interior');
		   
INSERT INTO saeb.tb_classificacao(
	no_classificao, nu_ano_inicio, nu_ano_fim, nu_valor_minimo, nu_valor_maximo)
	VALUES ('Nível I', 2011, 2013, 0, 30),
			('Nível II', 2011, 2013, 30, 40),
			('Nível III', 2011, 2013, 40, 50),
			('Nível IV', 2011, 2013, 50, 60),
			('Nível V', 2011, 2013, 60, 70),
			('Nível VI', 2011, 2013, 70, 80),
			('Nível I', 2015, 2015, 0, 20),
			('Nível II', 2015, 2015, 20, 40),
			('Nível III', 2015, 2015, 40, 48),
			('Nível IV', 2015, 2015, 48, 56),
			('Nível V', 2015, 2015, 56, 65),
			('Nível VI', 2015, 2015, 65, 76),
			('Nível VII', 2015, 2015, 76, 84),
			('Nível I', 2019, 2021, 0, 3),
			('Nível II', 2019, 2021, 3, 4),
			('Nível III', 2019, 2021, 4, 4.5),
			('Nível IV', 2019, 2021, 4.5, 5),
			('Nível V', 2019, 2021, 5, 5.5),
			('Nível VI', 2019, 2021, 5.5, 6),
			('Nível VII', 2019, 2021, 6, 7)
			;
			
INSERT INTO saeb.tb_classificacao(
	no_classificao, nu_ano_inicio, nu_ano_fim, nu_valor_minimo)		
	VALUES ('Nível VII', 2011, 2013, 80),
		  ('Nível VIII', 2015, 2015, 84),
		  ('Nível VIII', 2019, 2021, 7)
		  ;

