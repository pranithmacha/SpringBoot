USE shoppingcart;

INSERT INTO users(username,email,password,enabled)
VALUES ('cristiano','cr7@realmadrid.com','ronaldo', true);
INSERT INTO users(username,email,password,enabled)
VALUES ('gareth','gb11@realmadrid.com','bale', true);


INSERT INTO user_roles (userid, role)
VALUES (001, 'ROLE_USER');
INSERT INTO user_roles (userid, role)
VALUES (002, 'ROLE_ADMIN');
INSERT INTO user_roles (userid, role)
VALUES (002, 'ROLE_USER');