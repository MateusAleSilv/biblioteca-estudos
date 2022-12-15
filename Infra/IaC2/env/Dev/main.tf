module "aws-dev" {
  source = "../../infra"
  instacia = "t2.micro"
  regiao_aws = "us-east-1"
  chave = "IaC-DEV"
}

output "IP" {
  value = module.aws-dev.IP_publico
}