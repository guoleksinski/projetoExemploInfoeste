import axios from "axios";

// Variáveis de ambiente para conexão com o Back-End Local ou de Produção (AWS - Docker)
const ENV_DESENVOLVIMENTO = "localhost:8080"


const api = axios.create({
  baseURL: `http://${ENV_DESENVOLVIMENTO}`
});


export default api;