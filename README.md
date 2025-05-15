# 🚀 FirstSpringApplication

Este é um projeto CRUD de usuários feito com **Spring Boot**, com persistência no banco **MySQL na nuvem (Railway)** e deploy gratuito na plataforma **Render**. Foi desenvolvido com foco em aprendizado backend usando boas práticas, arquitetura MVC, testes automatizados e documentação com Swagger.

---

## ✅ Tecnologias Utilizadas

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- MySQL (Railway)
- Maven
- Render (deploy gratuito)
- JUnit + Mockito (testes)
- Postman (testes de API)
- Swagger (Documentação dos endpoints)

---

## 🚀 Acesse a API em produção

🔗 **Base URL**:  
[https://firstspringapplication.onrender.com](https://firstspringapplication.onrender.com)

### Exemplo:
```bash
GET https://firstspringapplication.onrender.com/users

---

## 📚 Documentação da API (Swagger UI)

Acesse a documentação interativa no Swagger:

👉 [https://firstspringapplication.onrender.com/swagger-ui/index.html](https://firstspringapplication.onrender.com/swagger-ui/index.html)

Lá você pode visualizar todos os endpoints, testar requisições e ver exemplos de entrada e saída.

---

💻 Como rodar localmente

git clone https://github.com/Wlllr/FirstSpringApplication.git
cd FirstSpringApplication

DB_URL=jdbc:mysql://<host>:<port>/<database>
DB_USERNAME=<usuario>
DB_PASSWORD=<senha>
SPRING_DATASOURCE_DRIVER=com.mysql.cj.jdbc.Driver

./mvnw spring-boot:run


🧪 Rodar os testes
./mvnw test


📬 Contato

Desenvolvido por Weller
📧 Email: weller_pereira@.com
🔗 GitHub: @Wlllr
