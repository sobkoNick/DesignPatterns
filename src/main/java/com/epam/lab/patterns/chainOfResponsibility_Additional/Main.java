package com.epam.lab.patterns.chainOfResponsibility_Additional;

import org.apache.log4j.Logger;

/**
 * As the name suggests, the chain of responsibility pattern creates
 * a chain of receiver objects for a request.
 * This pattern decouples sender and receiver of a request based on type of request.
 * This pattern comes under behavioral patterns.
 * <p>
 * In this pattern, normally each receiver contains reference to another receiver.
 * If one object cannot handle the request then it passes the same to the next receiver and so on.
 *
 * Chain of responsibility - пропускаем некоторый запрос через набор обработчиков событий,
 * до тех пор пока запрос не будет обработан.
 *
 *  Chain of responsibility - запобігає звязуванню відправника запиту з його приймачем, таким чином
 *  цей запит може обробити більш ніж один обєкт. Звязує об'єкти отримувачі та передає запит по ланцюжку
 *  до тих пір поки потрібний об'єкт його обробить.
 *
 *  Chain of responsibility (цепочка обязанностей)
 *  Самым простым примером цепочки обязанностей можно считать получение какого-либо официального документа.
 *  Например вам требуется получить справку со счета из банка.
 *  Так или иначе, вы должны эту справку получить, однако кто именно ее должен вам дать — пока не ясно.
 *  Вы приходите в местное отделение банка, вам говорят что «мы сейчас заняты, идите в другое отделение»,
 *  дальше вы идете в другое, там вам отвечают «мы этим не занимаемся»,
 *  вы идете в региональное отделение и там получаете нужную справку.
 *  Таким образом паттерн реализует «цепочку обязанностей» отдельные объекты которой (отделения банка)
 *  должны обработать ваш запрос. Соответственно ваш запрос может быть обработан в первом же отделении,
 *  или же в нескольких, в зависимости от самого запроса и обрабатывающих объектов.
 *
 * https://hsto.org/getpro/habr/post_images/ec8/3ef/362/ec83ef3621e0dbe56bed96e3c272e3ff.jpg
 */
public class Main {
    public static final Logger LOG = Logger.getLogger(Main.class);

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger warnLogger = new WarnLogger(AbstractLogger.WARN);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        infoLogger.setNextLogger(warnLogger);
        warnLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.showMessage(AbstractLogger.INFO, "Some info message");
        loggerChain.showMessage(AbstractLogger.WARN, "Warning! Change smtg in your code");
        loggerChain.showMessage(AbstractLogger.ERROR, "ERROOOOORRRR!");
    }
}
