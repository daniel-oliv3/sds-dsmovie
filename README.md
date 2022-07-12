## Spring React.

### 1 - Front-end estático.
**Criar projeto, back-end e front-end, salvar o projeto no Github em monorepo, montar o visual estático do front-end**

## Ferramentas.
**NodeJS.**
- NodeJS - https://nodejs.org/en/

**Visual Studio Code**
- Vscode - https://code.visualstudio.com/

**Extenções** 
- VSCode
  - `Color Highlight`
  - `ESLint`
  - `JSX HTML <tags/>`
  - `Live Server`

## Passo: preparação.

**Verificando instalação no prompt de comando**
```
node -v
```
```
yarn -v
```
## Design Figma
```
https://www.figma.com/file/hpQuzpGHq2MmrI87xnfMoT/DSMovie1
```
```
https://www.figma.com/file/svCMhNqgpAZuN86w9IHJ4v/DSMovie2
```
```
https://www.figma.com/file/gEZYKqJJs2gEhIB6k9ksGB/DSMovie3
```
```
https://www.figma.com/file/hyovBMIxwrn2Bb5MZLrxHL/DSMovie4
```

## Passo: criar o projeto ReactJS.

![DevSuperior no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/sds/pastas-dsmovie.png)

## ReactJS
- Documentação: - https://pt-br.reactjs.org/docs/create-a-new-react-app.html

```
yarn create react-app frontend --template typescript
```

**ou**

```
npx create-react-app frontend --template typescript
```
**IMPORTANTE:** deletar subpasta .git
  - Lembrete: ver extenções e arquivos ocultos


**Roda o projeto ReactJS**
```
npm start
```

**ou**

```
yarn start
```

## Passo: criar o projeto Spring Boot.
**Criar projeto Spring Boot no Spring Initializr com as seguintes depenências.**
- Spring Initializr
  - `Web`
  - `JPA`
  - `H2`
  - `Postgres`
  - `Security`

## Spring Initializr.
- Site - https://start.spring.io/


**Ajuste no arquivo pom.xml**
```xml
 <plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
 </plugin>
```

**- Botão direito no projeto -> Maven -> Update project (force update)**


## Passo: Salvar primeira versão no Github.
**Gitbub.**
```bash
git config --global user.name seu_nome
git config --global user.email seu_email

git init
git add .
git commit -m "Create project"
git branch -M main
git remote add origen git@github.com: https://github.com/dsmeta-webapp
git push -u origin main
```

## Passo: "Limpar" o projeto ReactJS.
- Deletar arquivos não usados

## Passo: adicionar Bootstrap e CSS ao projeto.
- Site - https://getbootstrap.com/

- **Bootstrap**
```
yarn add bootstrap@5.1.3
```

- Arquivo index.css
```css
@import url('https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;700&display=swap');

:root {
  --color-primary: #4D41C0;
}

* {
    box-sizing: border-box;
    font-family: 'Open Sans', sans-serif;
}

html, body {
    background-color: #E5E5E5;
}

a, a:hover {
  text-decoration: none;
  color: unset;
}
```





##

![Parabéns!](https://raw.githubusercontent.com/devsuperior/bds-assets/main/img/trophy.png)

##

- By:  **Daniel Oliveira**

  - `Instagram` - https://www.instagram.com/danieloliv3/
  - `Facebook` - https://web.facebook.com/danielsapup3/
  - `Twitter` - https://twitter.com/danielsapup3/
  - `Linkedin` - https://www.linkedin.com/in/danielsapup3/

